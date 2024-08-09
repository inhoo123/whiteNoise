document
  .querySelector("#RainVolumeSlider")
  .addEventListener("input", function () {
    const sliderValue = this.value;
    const rain = document.querySelector("#rain");
    rain.style.opacity = sliderValue / 1;
    rain.volume = sliderValue / 1;
  });
document
  .querySelector("#ThunderVolumeSlider")
  .addEventListener("input", function () {
    const sliderValue = this.value;
    const thunder = document.querySelector("#thunder");
    thunder.style.opacity = sliderValue / 1;
    thunder.volume = sliderValue / 1;
  });
document
  .querySelector("#FanVolumeSlider")
  .addEventListener("input", function () {
    const sliderValue = this.value;
    const fan = document.querySelector("#fan");
    fan.style.opacity = sliderValue / 1;
    fan.volume = sliderValue / 1;
  });
