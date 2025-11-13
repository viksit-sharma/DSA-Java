package lect7;
//Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display movies released after 2020.
class Movie {
    String name;
    float rating;
    int releaseYear;

    Movie(String name, float rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    void display() {
        if (this.releaseYear > 2020) {
        System.out.println("Name is : "+this.name);
        System.out.println("Rating is : "+this.rating);
        System.out.println("Release year is : " + this.releaseYear);
        System.out.println();
    }
    }
}
public class dsa25 {
    public static void main(String[] args) {
        Movie[] m = new Movie[] {
            new Movie("RRR", 4.9f , 2023),
            new Movie("3 idiots", 5f , 2009),
            new Movie("Saiyaara", 4.6f , 2025),
            new Movie("Housefull 5", 4.0f , 2024),
            new Movie("Pushpa", 4.7f , 2020),
            new Movie("Pushpa 2", 4.8f, 2024),
            new Movie("Bahubali", 4.8f, 2015)
        };

        for (Movie movie : m) {
            if (movie != null) {
                movie.display();
            }
        }
    }
}
