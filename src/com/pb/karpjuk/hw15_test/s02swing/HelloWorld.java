package com.pb.karpjuk.hw15_test.s02swing;

import javax.swing.*;
import java.awt.*;

public class HelloWorld implements Runnable {

    public static void main(String[] args) {

        // Swing имеет собственный управляющий поток (т.н. dispatching thread),
        // который работает параллельно с основным (стартовым, в котором выполняется main())
        // потоком. Это означает, что если основной поток закончит работу (метод main завершится),
        // поток, отвечающий за работу Swing-интерфейса, может продолжать свою работу.
        // И даже если пользователь закрыл все окна, программа продолжит свою работу
        // (до тех пор, пока жив данный поток). Начиная с Java 6, когда все компоненты уничтожены,
        // управляющим интерфейсом поток останавливается автоматически.

        // Правило single-thread (однопоточности) Swing: компоненты и модели Swing должны создаваться,
        // изменяться и запрашиваться только из dispatching thread (собственного управляющего потока).

        // Запускаем весь код, работающий с интерфейсом, в управляющем потоке, даже инициализацию:

        SwingUtilities.invokeLater (new HelloWorld());
    }

    public void run() {

        // Создаем окно с заголовком "Hello, World!"

        JFrame f = new JFrame ("Hello, World!");

        // Ранее практиковалось следующее: создавался listener и регистрировался
        // на экземпляре главного окна, который реагировал на windowClosing()
        // принудительной остановкой виртуальной машины вызовом System.exit().
        // Теперь же есть более "правильный" способ задать реакцию на закрытие окна.
        // Данный способ уничтожает текущее окно, но не останавливает приложение. Тем
        // самым приложение будет работать, пока не будут закрыты все окна.

        f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

        // однако можно задать и так:
        // f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        // Добавляем на панель окна нередактируемый компонент с текстом.

        //f.getContentPane().add (new JLabel("Hello, World!")); - старый стиль
        f.add(new JLabel("Hello World"), BorderLayout.NORTH);
        f.add(new JButton("Submit"), BorderLayout.SOUTH);

        // pack() "упаковывает" окно до оптимального размера, рассчитанного на основании размеров
        // всех расположенных в нём компонентов.

        f.pack();

        // Показать окно

        f.setVisible(true);
    }
}
