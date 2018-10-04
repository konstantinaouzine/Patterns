package Patterns.Pattern_Facade;

public class User {
    String name;
    HomeTheaterFacade homeTheaterFacade;

    public User(String name, HomeTheaterFacade homeTheaterFacade) {
        this.name = name;
        this.homeTheaterFacade = homeTheaterFacade;
    }

    public void watchMovie(String movie){
        System.out.println("---------------------------");
        homeTheaterFacade.playMovie(movie);
    }

    public void takeBreakFromMovie(){
        System.out.println("---------------------------");
        homeTheaterFacade.pauseMovie();
    }

    public void startLearning(){
        System.out.println("---------------------------");
        homeTheaterFacade.stopMovie();
        System.out.println("Start learning");
    }
}
