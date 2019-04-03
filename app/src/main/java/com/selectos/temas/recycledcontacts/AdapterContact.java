package com.selectos.temas.recycledcontacts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterContact extends RecyclerView.Adapter <AdapterContact.ContactViewHolder>{

    ArrayList<Contact> contacts; //Lista de objetos de contactos

    public AdapterContact(ArrayList<Contact> contacts)
    {
        this.contacts = contacts;
    }

    @NonNull //No acepta valores nulos
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) { //onCreate vincula con la vista del layout CardView
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_contact,viewGroup,false); //To inflate the card view

        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int position)
    {
        final Contact contact = contacts.get(position);  //Obtener la posición del contacto en tiempo real  final=const
        contactViewHolder.txtvName.setText(contact.getName());
        contactViewHolder.txtvEmail.setText(contact.getEmail());
        contactViewHolder.txtxPhone.setText(contact.getPhone());
        contactViewHolder.imgPhoto.setImageResource(contact.getIdPhoto());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }







    public static class ContactViewHolder extends RecyclerView.ViewHolder //Clase anidada estática (no requiere de objetos)
    {
        private TextView txtvName;
        private ImageView imgPhoto;
        private TextView txtvEmail;
        private TextView txtxPhone;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            txtvName = itemView.findViewById(R.id.txtvName);
            imgPhoto = itemView.findViewById(R.id.imgPhoto);
            txtvEmail = itemView.findViewById(R.id.txtvEmail);
            txtxPhone = itemView.findViewById(R.id.txtvPhone);
        }
    }
}
