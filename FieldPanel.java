package ru.gb.stream200302_lesson_7;

import javax.swing.*;
import java.awt.*;

//11. добавляем панельку с полем (игравая панель, поле на котором будем игарать)
public class FieldPanel extends JPanel {
    public static final int MODE_HVH =0; //35д.
    public static final int MODE_HVA =1; //35д.

    FieldPanel () { // 12. Конструктор Jпанели, который устанавливает ей
        setBackground(Color.green); // 12а. основной фон в зеленом цвете
    }

    public void startNewGame (int gameMode, int fieldSizeX, int fieldSizeY, int winLength) { // 15. Все действия игры будут здесь, для начала игры нам надо:
         System.out.printf("game mode: %d\nfield size: %d, \nwin length: %d\n",gameMode, fieldSizeX, winLength); // 15a. режим игры, размер поля, винлайн,

                                        //дз. пишем разлиновку поля после кода с параметрами вывода игры на экран
                                        // т.е. весь код принажлежит методу стартНьюГейм
        Graphics g = getGraphics(); //дз. объявляем графичесое поле для рисования мерез метод getGraphics и присваюваи ссылку на объект
        g.setColor(Color.BLUE); //дз. устанавливаю синий цвет для рисования, закрашиваем все поле в синий цвет

        g.fillRect(0,0,507,555); // дз. т.к. окно не растягиваемое, явно задаем длину и ширину
        g.setColor(Color.white); //дз., закрашиваем линии в красный цвет

        for (int i = 0; i < fieldSizeX; i++) { //дз. рисуем линии по х
            g.drawLine((int)(507/fieldSizeX*i),0,(int)(507/fieldSizeX*i),555);
        }

        for (int j = 0; j < fieldSizeY; j++) { //дз. рисуем линии по у
            g.drawLine(0,(int)(555/fieldSizeY*j),507,(int)(555/fieldSizeY*j));
        }






    }

}
