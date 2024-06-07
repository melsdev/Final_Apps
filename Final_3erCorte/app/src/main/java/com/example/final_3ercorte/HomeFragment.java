package com.example.final_3ercorte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private HomeAdapter adapter;
    private List<Hero> heroes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        heroes = new ArrayList<>();
        adapter = new HomeAdapter(heroes);
        recyclerView.setAdapter(adapter);

        // Llamar a la API para obtener los superhéroes
        // Por ejemplo, utilizando la biblioteca Marvel API Client
        // ...
        // Mostrar los superhéroes en el RecyclerView
        heroes.add(new Hero("Superhéroe 1", "Descripción del superhéroe 1"));
        heroes.add(new Hero("Superhéroe 2", "Descripción del superhéroe 2"));
        heroes.add(new Hero("Superhéroe 3", "Descripción del superhéroe 3"));

        adapter.notifyDataSetChanged();
        return view;
    }
}
