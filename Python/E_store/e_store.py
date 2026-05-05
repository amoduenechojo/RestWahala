class e_store:


    class User:

        def __init__(self,age, name, email_address, address:Address, password, phone_number):
            self.age = age
            self.name = name
            self.email_address = email_address
            self.address:Address
            self.phone_number = phone_number

    class Customer(User):

        def __init__(self,name, age, email, password, phone_number, address):
            super().__init__(name, age, email, password, phone_number, address)

            self.billing_info: BillingInfo
            self.shopping_cart: ShoppingCart

    class Seller(User):

        def __init__(self, name, age, email, password, phone_number, address):
            super().__init__(name, age, email, password, phone_number, address)


    class Admin(User):

        def __init__(self, name, age, email, password, phone_number, address):
            super().__init__(name, age, email, password, phone_number, address)




    class BillingInfo():

        def __init__(self, receiver_phonenumber, receiver_name, delivery_address, credit_card_information):
            super().__init__(receiver_phonenumber, receiver_name, delivery_address, credit_card_information)
            self.receiver_phonenumber = receiver_phonenumber
            self.reciever_name = reciever_name
            self.delivery_address = delivery_address
            self.credit_card= credit_card




    class ShoppingCart:
        def __init__(self):
          self.items:Items[]




    class Address:
        def __init__(self,city,country_name,house_number, street, state):
            self.city = city
            self.country_name = country_name
            self.house_number = house_number
            self.street = street
            self.state = state




    class Product:
        def __init__(self,product_Id, product_name, prices, product_description, product_category):
            self.product_Id = product_Id
            self.product_name = product_name
            self.prices = prices
            self.product_description = product_description
            self.product_category = product_category


    class <<Enumeration>> Product()
        # def __init__(ELECTRONICS, GROCERIES, UTENSILS,  CLOTHINGD):
            "ELECTRONICS": ELECTRONICS
            "GROCERIES": GROCERIES
            "UTENSILS": UTENSILS

    class Item:
        super().__init__(shopping_cart)
        def __init__(self,quantity, product):
            self.quantity = quantity
            self.product = product:
        def
    class credit_card:
        def __init__(self, card_cvv, card_expiratory_year, card_expiratory_month, name, card_type ):
            self.card_cvv = card_cvv
            self.card_expiratory_year = card_expiratory_year
            self.card_expiratory_month = card_expiratory_month
            self.name = name
            self.card_type = card_type



    class Item:
        super().__init__(shopping_cart)
        def __init__(self,quantity, product):
            self.quantity = quantity
            self.product = product

