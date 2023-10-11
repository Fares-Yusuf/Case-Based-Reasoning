# Garden Plant Recommender

This Java program recommends a plant for your garden based on the size of your garden and the existing tree. It uses Euclidean Distance to calculate the closest match from a predefined list of gardens with different plants.

## Classes

The program consists of two classes:

1. `Main`: This is the main class where the program execution begins.
2. `Garden`: This class represents a garden with attributes such as height, width, and the type of tree it has.

## Methods

The `Main` class has two methods:

1. `main(String[] args)`: This is the entry point of the program. It initializes a list of gardens with different heights, widths, and plants. It then takes input from the user for the height, width, and plant of their garden and recommends a plant based on these inputs.

2. `recommendPlant(double queryHeight, double queryWidth)`: This method recommends a plant based on the user's garden size and existing tree. It calculates the Euclidean Distance between the user's garden size and each garden in the list, and recommends the plant from the garden with the smallest distance.

The `Garden` class has a constructor:

1. `Garden(double height, double width, String plant)`: This constructor initializes a new instance of the Garden class with the specified height, width, and plant.

## Usage

To use this program, simply run it and enter your garden's height, width, and plant when prompted. The program will then recommend a plant for your garden.

Please note that this is a simple program and does not account for factors such as climate, soil type, or personal preference in its recommendations.