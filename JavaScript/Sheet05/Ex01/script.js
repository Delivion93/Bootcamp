{
  /* <div class="card"> +
          <div class="card-top"> 
            <img
              src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
            />
            <p class="ID">ID/1</p>+
          </div>
          <div class="card-bottom">
            <h2>Bulbasaur</h2>+
            <ul class="type-list">+
              <li>poison</li>
              <li>grass</li>
            </ul>
            <div class="evolution"> +
              <p>Evoluciona de:</p>
              <p class="evolution-name">bulbasaur</p>
            </div>
          </div>
        </div> */
}
// function createCard(img, id, name, types, evolution)
function createCard(img, id, name) {
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
  const evolutionDiv = document.createElement("div");
  evolutionDiv.className = "evolution";
  const evolutionP = document.createElement("p");
  const evolutionName = document.createElement("p");
  evolutionName.className = "evolution-name";

  grid.appendChild(card);
  card.appendChild(cardTop);
  card.appendChild(cardBottom);
  cardTop.appendChild(image);
  cardTop.appendChild(pId);
  cardBottom.appendChild(h2);
  cardBottom.appendChild(list);
  cardBottom.appendChild(evolutionDiv);
  evolutionDiv.appendChild(evolutionP);
  evolutionDiv.appendChild(evolutionName);
}

async function getPokemons() {
  let pokemons = [];
  const response = await fetch("https://pokeapi.co/api/v2/pokemon");
  const data = await response.json();

  const pokemonPromises = data.results.map(async (element) => {
    const pokemonResponse = await fetch(element.url);
    const pokemonInfo = await pokemonResponse.json();
    let name = pokemonInfo.name;
    let image = pokemonInfo.sprites.front_default;
    let id = pokemonInfo.id;
    return { img: image, id: id, name: name };
  });
  pokemons = await Promise.all(pokemonPromises);
  pokemons.forEach((pokemon) => {
    createCard(pokemon.img, pokemon.id, pokemon.name);
  });
}
