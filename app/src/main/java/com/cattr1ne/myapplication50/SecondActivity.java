package com.cattr1ne.myapplication50;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Motive
    List<Motive> motives = new ArrayList<Motive>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_motive);

        // создадим адаптер и загрузим в него контейнер с данными
        MotiveAdapter adapter = new MotiveAdapter(this, motives);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        motives.add(new Motive("Возможно впереди нелёгкий путь, без места для отдыха но продолжай двигаться вперёд не сдаваясь.", "K.R", R.drawable.clouds));
        motives.add(new Motive("Не считай дни, извлекай из них пользу.", "Мухаммед Али", R.drawable.nature));
        motives.add(new Motive("Все, что делаешь, надо делать хорошо, даже если совершаешь безумство.", "Оноре де Бальзак", R.drawable.nature1));
        motives.add(new Motive("Даже если вы проходите через ад, продолжайте идти.", " Уинстон Черчилль", R.drawable.nature2));
        motives.add(new Motive("Делай сегодня то, что другие не хотят, завтра будешь жить так, как другие не могут.", "Джаред Лето", R.drawable.nature4));
        motives.add(new Motive("Мечтайте так, как будто вам жить вечно. Живите так, как будто вам умирать сегодня.", "Джеймс Дин", R.drawable.nature5));
        motives.add(new Motive("Пробуйте и терпите неудачу, но не прерывайте ваших стараний.", "Стивен Каггва", R.drawable.nature3));
        motives.add(new Motive("Ты плакал когда пришёл на этот свет, а мир тебе улыбался, живи так чтобы уходя ты улыбался, а мир плакал.", "Jimin from BTS", R.drawable.nature6));
        motives.add(new Motive("Возможности не приходят сами — вы создаете их.", "Крис Гроссер", R.drawable.nature7));
        motives.add(new Motive("Никогла не отказывайся от своей мечты.", "K.R", R.drawable.nature8));
        motives.add(new Motive("Следуй за мечтой. Достигни своей цели молча, ведь ты можешь это сделать.", "K.R", R.drawable.nature9));
        motives.add(new Motive("Все твои мечты могут стать реальностью. Поэтому продолжай идти вперёд. И никогда не останавливайся!", "K.R", R.drawable.nature10));
        motives.add(new Motive("Даже если ты потерпишь неудачу. Всё равно беги к своей мечте...", "K.R", R.drawable.nature11));
        motives.add(new Motive("Не отступайся от своей мечты, никогда!", "K.R", R.drawable.nature12));
        motives.add(new Motive("Каждый день делай шаг, чтобы повзрослеть. Но иногда можно показывать слабости, это нормально — быть собой.", "BTS-Lights", R.drawable.nature13));
        motives.add(new Motive("А сейчас раскрой свои глаза. Подумай о своей мечте. Хватит быть нерешительным, прекрати колебаться.", "BTS-No More Dream", R.drawable.nature14));
        motives.add(new Motive("Усилия создают тебя. И когда нибудь ты будешь сожалеть, если не сделаешь всё возможное сейчас.", "K.R", R.drawable.nature15));
        motives.add(new Motive("Верьте себе. И идите вперед. Это и есть первый шаг к успеху.", "K.R", R.drawable.nature16));
        motives.add(new Motive("Живи как хочешь ты, в любом случае добьешься своего, так что не старайся слишком сильно — проиграть тоже нормально.", "Suga from BTS", R.drawable.nature17));
        motives.add(new Motive("Это нормально если нет мечты. Мечты может и не быть. Достаточно просто быть счастливым.", "Suga from BTS", R.drawable.nature18));
        motives.add(new Motive("Даже в самую тёмную ночь сияй ярче звезд.", "K.R", R.drawable.nature20));
        motives.add(new Motive("Никогда не отказывайтесь от мечты, за которой вы гнались почти всю свою жизнь.", "Jimin from BTS", R.drawable.nature19));
        motives.add(new Motive("Жизнь трудна, и не всегда все складывается хорошо, но мы должны быть храбрыми и продолжать жить дальше.", "Suga from BTS", R.drawable.nature21));
        motives.add(new Motive("Когда становится трудно, остановитесь на некоторое время, оглянитесь назад и посмотрите, как далеко вы продвинулись. Не забывайте, как это полезно. Ты самый красивый цветок, больше, чем кто-либо другой в этом мире.", "K.R", R.drawable.nature23));
        motives.add(new Motive("Ты много работал — продолжай стараться изо всех сил", "K.T", R.drawable.nature24));
        motives.add(new Motive("Помните: вы лидер своей собственной жизни и повторяйте это снова и снова. « Я могу сделать это. Молодец. Я могу сделать это хорошо. Я могу сделать это лучше, чем кто-либо другой.", "K.R", R.drawable.nature25));
        motives.add(new Motive("Нет ничего невозможного, если ты действительон этого хочешь.", "K.R", R.drawable.nature26));
        motives.add(new Motive("Если ты собираешься в один прекрасный день создать что-то великое, помни что один прекрасный день – это сегодня.", "Стивен Спилберг", R.drawable.nature27));
        motives.add(new Motive("Вы никогда не будете слишком стары для того. Чтобы поставить перед собой новую цель или мечтать о чем-то новом.", "Клайв Стейплз Льюис", R.drawable.nature28));
        motives.add(new Motive("Лучший способ взяться за что-то — перестать говорить и начать делать.", "Уолт Дисней", R.drawable.nature29));
        motives.add(new Motive("Любая трудность на вашем пути - это возмжность чему-то научиться и стать лучше.", "K.R", R.drawable.nature30));
    }
}
