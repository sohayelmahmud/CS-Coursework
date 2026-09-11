import random

def get_valid_int(prompt, min_val, max_val):
    while True:
        user_input = input(prompt).strip()
        if user_input.isdigit():
            val = int(user_input)
            if min_val <= val <= max_val:
                return val
            else:
                print(f"Invalid range! Please enter between {min_val} and {max_val}.")
        else:
            print("Invalid input! Please enter a valid positive integer number.")

def print_invoice(ordered_items, ordered_qtys, subtotal, final_bill):
    order_id = "CF" + str(random.randint(1, 100))

    print("\n====================================")
    print(f"       INVOICE - ORDER #{order_id}   ")
    print("====================================")
    print(f"{'Item Name':<20} | {'Qty':<5} | {'Total':<10}")
    print("------------------------------------")

    for i in range(len(ordered_items)):
        name = ordered_items[i]
        qty = ordered_qtys[i]
        if name == "Espresso": price = 250
        elif name == "Americano": price = 280
        elif name == "Cappuccino": price = 320
        elif name == "Cafe Latte": price = 350
        elif name == "Chocolate Brownie": price = 180
        elif name == "Club Sandwich": price = 420
        elif name == "Burger": price = 280
        else: price = 0

        print(f"{name:<20} | {qty:<5} | {price * qty:<10}")

    print("------------------------------------")
    print(f"Subtotal:     {subtotal} PKR")
    print(f"Net Payable:  {final_bill} PKR")
    print("====================================")
    print("     Thank you for your visit!     ")

def get_item_data(item_id):
    if item_id == 1:
        return "Espresso", 250
    elif item_id == 2:
        return "Americano", 280
    elif item_id == 3:
        return "Cappuccino", 320
    elif item_id == 4:
        return "Cafe Latte", 350
    elif item_id == 5:
        return "Chocolate Brownie", 180
    elif item_id == 6:
        return "Club Sandwich", 420
    elif item_id == 7:
        return "Burger", 280
    return "", 0

def process_order():
    print("\n====================================")
    print("          CAFE MENU CARD            ")
    print("====================================")
    print("ID 1 | Espresso             | 250 PKR")
    print("ID 2 | Americano            | 280 PKR")
    print("ID 3 | Cappuccino           | 320 PKR")
    print("ID 4 | Cafe Latte           | 350 PKR")
    print("ID 5 | Chocolate Brownie    | 180 PKR")
    print("ID 6 | Club Sandwich        | 420 PKR")
    print("ID 7 | Burger               | 280 PKR")
    print("====================================")

    ordered_items = []
    ordered_qtys = []
    subtotal = 0
    discount_burger = 0
    discount_sand=0

    while True:
        item_id = get_valid_int("Enter Item ID to order (0 to finish): ", 0, 7)

        if item_id == 0:
            break
        
        if item_id == 7:
            discount_burger+=1
        elif item_id  == 6:
            discount_sand+=1
        qty = get_valid_int("Enter Quantity (1-10): ", 1, 10)

        item_name, price = get_item_data(item_id)

        if item_name in ordered_items:
            idx = ordered_items.index(item_name)
            ordered_qtys[idx] += qty
        else:
            ordered_items.append(item_name)
            ordered_qtys.append(qty)
    
    if discount_burger == 1:
        subtotal += int((price * qty) * 0.90)
    elif discount_sand == 1:
        subtotal += int((price * qty) * 0.95)
    else:
        subtotal += price * qty
    print(f"Added {qty}x {item_name} to cart. Current Subtotal: {subtotal} PKR\n")

    if len(ordered_items) == 0:
        print("No items selected.")
        return

    final_bill = subtotal

    print_invoice(ordered_items, ordered_qtys, subtotal, final_bill)

def main():
    while True:
        process_order()
        print("\n------------------------------------")
        choice = get_valid_int("Process next customer? (1 for Yes, 0 to Exit): ", 0, 1)
        if choice == 0:
            print("Thank you for using Cafe System. Goodbye!")
            break
if __name__ == "__main__":
    main()