package Patterns.Pattern_Command.Receivers_Of_Commands;

public class GarageDoor {
    private boolean doorOpenState = false;

    public void openDoor()
    {
        if (doorOpenState == false) {
            System.out.println("Opening garage...");
            doorOpenState = !doorOpenState;
        }
        else
            System.out.println("Door already opened, do nothing");
    }
    public void closeDoor()
    {
        if (doorOpenState == true) {
            System.out.println("Door closing garage...");
            doorOpenState = !doorOpenState;
        }
        else
            System.out.println("Door already closed, do nothing");
    }
}
