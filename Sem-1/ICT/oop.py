class PET():
    species = "Cats"
    
    def __init__(self, name, color):
        self.name = name
        self.color = color
        
    def showIntro(self):
        print(f"{self.name} has the color of {self.color}")
        
    def giveSoudnd(self, sound):
        print(f"{self.name} has the {sound} sound.")
        
dog = PET("Jemmy", "Black")
cat = PET("Billu", "Brown")

dog.showIntro()
cat.showIntro()
dog.giveSoudnd("gheogheo")