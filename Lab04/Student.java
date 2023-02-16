package Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade () {
        double score = (mScore * 0.4) + (fScore * 0.4) + 20;
        System.out.println("Your grade : " + score);
    }
}
