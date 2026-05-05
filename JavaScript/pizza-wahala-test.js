const calculatePizzaSizesPrize = require('./pizza-wahala')

test(`should calculate the tota prize `, () =>{

    const boxes = 4
    const prizePerBox = 2200

    const totalCost = boxes * pricePerBox
    
    expect(calculateNumberOfDelivery(boxes, prizePerBox)).toBe(totalCost)
})



const calculatePizzaSizesPrize = require('./pizza-wahala')

test(`should calculate the tota prize `, () =>{

    let guests = 36
    let boxes = 10
    let slicePerBox = 4 

    const totalSlices = boxes * slicePerBox
    const leftoverSlices = totalSlices  - guests
    
    
    expect(calculateNumberOfDelivery(guests, boxes, slicePerBox)).toBe(totalSlices,leftoverSlices)
})





