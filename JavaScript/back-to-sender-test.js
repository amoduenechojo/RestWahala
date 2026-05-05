const calculateNumberOfDelivery = require('./back-to-sender')

test(`should calculate payment correctly for less than 50 deliveries`, () =>{

    const deliveries = 40
    const expectedPay = (40 * 160) + 5000
    
    expect(calculateNumberOfDelivery(deliveries)).toBe(expectedPay)
})


test(`should calculate payment correctly for above 60 deliveries`, () =>{

    const deliveries = 67
    const expectedPay = (67 * 200) + 5000
    
    expect(calculateNumberOfDelivery(deliveries)).toBe(expectedPay)
})


test(`should calculate payment correctly for above 72 deliveries`, () =>{

    const deliveries = 99
    const expectedPay = (99 * 200) + 5000
    
    expect(calculateNumberOfDelivery(deliveries)).toBe(expectedPay)
})


test(`should not calculate payment correctly for deliveries less than 0`, () =>{

    const deliveries = -159
    const expectedPay = (-159 * 200) + 5000
    
    expect(calculateNumberOfDelivery(deliveries)).toBe(expectedPay)
})
