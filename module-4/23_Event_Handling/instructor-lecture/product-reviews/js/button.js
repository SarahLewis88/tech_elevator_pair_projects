document.addEventListener('DOMContentLoaded', () => {


  //do something when document is fully loaded;
  createAlert();

});


function createAlert() {


    const button1 = document.querySelector('button');

    button1.addEventListener('click', () =>{
        alert('You have been hacked!');
    })



}