package com.example.neto.exemploaulapickers;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(),this, 2018,8,18);
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        String msg = "Data: " + dayOfMonth + " / " + (month+1) + " / " + year ;
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
