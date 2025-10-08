// Q8. Create a class Movie with variables movieName, rating, and duration.
class Movie {
    String movieName;
    double rating;
    double duration;

    void showMovieInfo() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration + " hrs");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.movieName = "KGF 2";
        m1.rating = 8.9;
        m1.duration = 2.5;

        Movie m2 = new Movie();
        m2.movieName = "Jawan";
        m2.rating = 8.0;
        m2.duration = 2.8;

        Movie m3 = new Movie();
        m3.movieName = "Pushpa";
        m3.rating = 8.5;
        m3.duration = 3.0;

        m1.showMovieInfo();
        m2.showMovieInfo();
        m3.showMovieInfo();
    }
}
