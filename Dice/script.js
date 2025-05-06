const themes = [
    { theme: "dark", priClr: "#1e2022", secClr: "#22262f" },
    { theme: "light", priClr: "#fff", secClr: "#f3f3f3" },
    { theme: "custom", priClr: "#b91c1c", secClr: "#e0e0e0" }
  ];
  
  let themeIndex = 0;
  
  const themesDOM = document.querySelector(".themes");
  
  const redirectBtn = document.getElementById("redirectTo");
  
  const componentID = "670de779b4693a3b7aba7c97";
  
  let baseURL = `https://we-code.dev/components/component?id=${componentID}`;
  
  const themeEvent = (targetEle) => {
    const targetElement = targetEle.target;
  
    const targetEleIndex = Array.from(
      document.querySelectorAll(".themes ul li")
    ).indexOf(targetElement);
  
    const switchThemeTo = targetElement.getAttribute("data-theme");
  
    const parentElement = targetElement.closest("ul");
  
    const { x: parentX } = parentElement.getBoundingClientRect();
    const { x: targetX } = targetElement.getBoundingClientRect();
  
    const fromX = `${targetX - parentX}px`;
  
    parentElement.style.setProperty("--posX", fromX);
  
    const containerEle = document.querySelector(".container");
  
    baseURL = `${baseURL.split("&")[0]}&theme=${switchThemeTo}`;
  
    containerEle.setAttribute("data-theme", switchThemeTo);
  
    const { priClr, secClr } = themes[targetEleIndex];
  
    containerEle.style.setProperty(
      "--matchBg",
      `linear-gradient(to bottom right, ${priClr}, ${secClr})`
    );
  };
  
  const renderThemes = () => {
    const ulEle = document.createElement("ul");
  
    themes.forEach((themeData) => {
      const { theme, priClr, secClr } = themeData;
  
      const liEle = document.createElement("li");
  
      liEle.style.background = `linear-gradient(to bottom right, ${priClr} 50%, ${secClr} 50%)`;
  
      liEle.setAttribute("data-theme", theme);
  
      liEle.addEventListener("click", themeEvent);
  
      ulEle.appendChild(liEle);
    });
  
    themesDOM.appendChild(ulEle);
  };
  
  redirectBtn.addEventListener("click", () => window.open(baseURL, "_blank"));
  
  renderThemes();
  
  let currentFace = 1;
  
  const getRandomFace = () => {
    let newFace;
  
    do {
      newFace = Math.floor(Math.random() * 6) + 1;
    } while (newFace === currentFace);
  
    return newFace;
  };
  
  const rollDiceInterval = setInterval(() => {
    const randomFace = getRandomFace();
  
    document.querySelector(".dice").setAttribute("data-face", randomFace);
  }, 500);
  
  