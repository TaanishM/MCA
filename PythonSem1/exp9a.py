class GeometryCalculator:
    def calculate_circle_area(self, radius):
        return 3.14159 * radius ** 2
    def calculate_circle_circumference(self, radius):
        return 2 * 3.14159 * radius
    def calculate_rectangle_area(self, length, width):
        return length * width
    def calculate_rectangle_perimeter(self, length, width):
        return 2 * (length + width)

    @staticmethod
    def calculate_factorial(n):
        if n == 0:
            return 1
        else:
            return n * GeometryCalculator.calculate_factorial(n - 1)

# Example usage:
calculator = GeometryCalculator()

# Calculate circle area and circumference
circle_area = calculator.calculate_circle_area(8)
circle_circumference = calculator.calculate_circle_circumference(8)
print(f"Circle Area: {circle_area}")
print(f"Circle Circumference: {circle_circumference}")

# Calculate rectangle area and perimeter
rectangle_area = calculator.calculate_rectangle_area(8, 12)
rectangle_perimeter = calculator.calculate_rectangle_perimeter(8, 12)
print(f"Rectangle Area: {rectangle_area}")
print(f"Rectangle Perimeter: {rectangle_perimeter}")

# Calculate factorial
factorial_value = GeometryCalculator.calculate_factorial(7)
print(f"Factorial of 7: {factorial_value}")
