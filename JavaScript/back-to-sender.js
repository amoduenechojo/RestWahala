function successfulDelivery(){

    let basePay = 5000
    let amountParcel = 0

    const prompt = require("prompt-sync")
    let deliveries = Number(prompt("Enter number of successful deliveries: "))

     if (deliveries < 50){
            amountParcel = 160;
        }

        else if(deliveries >= 50 && deliveries <= 59){
            amountParcel = 200;
        }

        else if(deliveries >= 60 && deliveries <= 69){
            amountParcel = 250;
        }

        else if (deliveries >= 70){
            amountParcel = 500;
        }

        else{
            console.log("Invalid delivery rate.");}

            return deliveries * amountParcel + 5000
   
    




}
