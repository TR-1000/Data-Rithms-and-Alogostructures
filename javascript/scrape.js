const fs = require('fs');
const got = require('got');
const jsdom = require("jsdom");
const { JSDOM } = jsdom;

const vgmUrl= 'https://www.realtor.com/realestateandhomes-detail/Angelina-Dr_Aledo_TX_76008_M79999-58965';

got(vgmUrl).then(response => {
  const dom = new JSDOM(response.body, {
      runScripts: "dangerously",
      resources: "usable"
    });
  //console.log(response.body);
  const { document } = dom.window;
  console.log(document);
  mainImage = document.querySelector("div.main-carousel");
  console.log(document.querySelector("title").textContent);
  console.log(mainImage);
  setTimeout(() => {
    mainImage.click();
    console.log(document.querySelectorAll("img.gallery-item"));
    document.querySelectorAll("img.gallery-photo").forEach((item) => {
    console.log(item.src);
  }, 5000);
  });

}).catch(err => {
  //console.log(err);
});
