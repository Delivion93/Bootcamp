function createCard() {
  const grid = document.getElementById("grid");
  const card = document.createElement("div");
  card.className = "card";
  const cardTop = document.createElement("div");
  cardTop.className = "card-top";
  const image = document.createElement("img");
  const pId = document.createElement("p");
  pId.className = "ID";
  const cardBottom = document.createElement("div");
  cardBottom.className = "card-bottom";
  const h2 = document.createElement("h2");
  const list = document.createElement("ul");
  list.className = "type-list";
  const evolution = document.createElement("div");
  evolution.className = "evolution";
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
  cardBottom.appendChild(evolution);
  evolution.appendChild(evolutionP);
  evolution.appendChild(evolutionName);
}
