package com.cattr1ne.myapplication50;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MotiveAdapter extends RecyclerView.Adapter<MotiveAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Motive> motives; // поле коллекции контейнера для хранения данных (объектов класса Motive)

    // конструктор адаптера
    public MotiveAdapter(Context context, List<Motive> motives) {
        this.inflater = LayoutInflater.from(context);
        this.motives = motives;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Motive
    @Override
    public MotiveAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Motive по определенной позиции
    @Override
    public void onBindViewHolder(MotiveAdapter.ViewHolder holder, int position) {
        Motive motive = motives.get(position);
        holder.motiveView.setImageResource(motive.getMotiveResource());
        holder.descriptionView.setText(motive.getDescription());
        holder.authorView.setText(motive.getAuthor());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return motives.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView motiveView;
        final TextView descriptionView, authorView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            motiveView = view.findViewById(R.id.motiveResource);
            descriptionView = view.findViewById(R.id.description);
            authorView = view.findViewById(R.id.author);
        }
    }
}

