document.addEventListener("DOMContentLoaded", () => {
  function createCard(img, id, name, types, evolution) {
    const grid = document.getElementById("grid");
    const card = document.createElement("div");
    card.className = "card";
    const cardTop = document.createElement("div");
    cardTop.className = "card-top";
    const image = document.createElement("img");
    image.src = img;
    image.alt = name;
    const pId = document.createElement("p");
    pId.className = "ID";
    pId.textContent = `ID / ${id}`;
    const cardBottom = document.createElement("div");
    cardBottom.className = "card-bottom";
    const h2 = document.createElement("h2");
    h2.textContent = name;
    const list = document.createElement("ul");
    list.className = "type-list";

    grid.appendChild(card);
    card.appendChild(cardTop);
    card.appendChild(cardBottom);
    cardTop.appendChild(image);
    cardTop.appendChild(pId);
    cardBottom.appendChild(h2);
    cardBottom.appendChild(list);
    types.forEach((type) => {
      const typeItem = document.createElement("li");
      typeItem.textContent = type.type.name;
      list.appendChild(typeItem);
    });
    if (evolution != null) {
      const evolutionDiv = document.createElement("div");
      evolutionDiv.className = "evolution";
      cardBottom.appendChild(evolutionDiv);
      const evolutionP = document.createElement("div");
      evolutionP.textContent = "Evoluciona de:";
      evolutionP.id = "evoFrom";
      const evolutionName = document.createElement("div");

      evolutionName.className = "evolution-name";
      evolutionName.textContent = evolution.name;
      evolutionDiv.appendChild(evolutionP);
      evolutionDiv.appendChild(evolutionName);
    }
  }

  async function getPokemons() {
    let pokemons = [];
    const response = await fetch("https://pokeapi.co/api/v2/pokemon");
    const data = await response.json();

    const pokemonPromises = data.results.map(async (element) => {
      const pokemonResponse = await fetch(element.url);
      const pokemonInfo = await pokemonResponse.json();
      const name = pokemonInfo.name;
      const image = pokemonInfo.sprites.front_default;
      const id = pokemonInfo.id;
      const types = pokemonInfo.types;
      const speciesResponse = await fetch(
        `https://pokeapi.co/api/v2/pokemon-species/${id}/`
      );
      const speciesInfo = await speciesResponse.json();
      const evolution = speciesInfo.evolves_from_species;
      return {
        img: image,
        id: id,
        name: name,
        type: types,
        evolution: evolution,
      };
    });
    pokemons = await Promise.all(pokemonPromises);
    return pokemons;
  }

  async function drawGrid() {
    const pokemons = await getPokemons();
    pokemons.forEach((pokemon) => {
      createCard(
        pokemon.img,
        pokemon.id,
        pokemon.name,
        pokemon.type,
        pokemon.evolution
      );
    });
  }
  drawGrid();
});
