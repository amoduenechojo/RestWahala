function pizzaType()

    let pizzaType = """
                    S/N       PIZZA TYPE           SLICE/BOX      PRICE
                    1:        Sapa size             4             2200
                    2:        Small money size      6             2400
                    3:        Big boys size         8             3000
                    4:        Odogwu size           12            4200
    """
                    
    console.log(pizzaType)



function solvingPizza(guests, slicePerBox, pricePerBox):

    let boxes = guests / slicePerBox

    if guests % slicePerBox != 0:
        boxes += 1

    let totalSlices = boxes * slicePerBox
    let leftoverSlices = totalSlices - guests
    let totalCost = boxes * pricePerBox

    return boxes, leftoverSlices, totalCost


function pizzaSizes()

const prompt = require("prompt-sync")
let pizzaTypeoption = Number(prompt("Enter a pizza type: "))

const prompt = require("prompt-sync")
let guests = Number(prompt("Enter number of guests: "))
   

switch (pizzaTypeOption):

    case 1:
        slicePerBox = 4
        pricePerBox = 2200
        solvingPizza(guests, slicePerBox, pricePerBox)
    

    case 2: 
           slicePerBox = 6
           pricePerBox = 2400
           solvingPizza(guests, slicePerBox, pricePerBox)
        

    case 3: 
            slicePerBox = 8 
            pricePerBox = 3000
            solvingPizza(guests, slicePerBox, pricePerBox)
          

    case 4:
            slicePerBox = 8 
            pricePerBox = 3000
            solvingPizza(guests, slicePerBox, pricePerBox)

boxes, leftoverSlices, totalCost = solvingPizza(guests, slicePerBox, pricePerBox)

console.log("The number of boxes needed is:", boxes)
console.log("The leftover slices are:", leftoverSlices)
console.log("The total cost is:", totalCost)
