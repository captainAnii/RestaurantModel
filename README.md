# RestaurantModel
## Description
This is a simple Spring Boot project that provides basic Restaurant model functionality without using any database. The restaurants are stored in memory and can be added, retrieved, updated, and deleted through RESTful APIs.

## Technologies Used
- Spring Boot
- Maven

## Endpoints
| HTTP Method | Endpoint           | Description                      |
|-------------|--------------------|----------------------------------|
| POST        | /api/restaurants/addRestaurant     | Adds a new restaurant                  |
| GET         | /api/restaurant/getRestaurant/{userId} | Retrieves a restaurant by their user ID |
| GET         | /api/restaurant/getAllrs | Retrieves all restaurants              |
| PUT         | /api/restaurant/updateRestaurantInfo/{userId} | Updates a restaurant's information by their user ID |
| DELETE      | /api/restaurant/deleteRestaurant/{userId} | Deletes a restaurant by their user ID  |

## User Attributes
- `userId`: Unique identifier of the restaurant
- `name`: Full name of the restaurant
- `address`: Address of the restaurant
- `number`: number of the restaurant
- `specialty`: specialty of the restaurant
- `totalstaffs`: totalstaffs in the restaurant

## Getting Started
To run this project locally, follow these steps:

1. Clone this repository: `git clone https://github.com/captainAnii/RestaurantModel.git`
2. Navigate to the project directory: `cd RestaurantModel`
3. Build the project using Maven: `mvn clean install`
4. Run the project: `mvn spring-boot:run`

The project should now be running on `http://localhost:8080`.

## Contributing
If you'd like to contribute to this project, please fork the repository, make your changes, and submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
