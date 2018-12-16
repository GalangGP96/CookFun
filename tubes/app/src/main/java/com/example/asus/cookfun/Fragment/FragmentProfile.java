package com.example.asus.cookfun.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.cookfun.R;
import com.example.asus.cookfun.Session.SessionManagement;

import org.w3c.dom.Text;

import java.util.HashMap;

public class FragmentProfile extends Fragment {
    ImageView logout;
    SessionManagement sessionManagement;
    TextView nama,email;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);
        logout = (ImageView) view.findViewById(R.id.imgLogout);
        nama = (TextView) view.findViewById(R.id.textNamaUser);
        email = (TextView) view.findViewById(R.id.textEmailUser);

        sessionManagement = new SessionManagement(getContext());

        HashMap<String, String> user=sessionManagement.getUserInformation();
        nama.setText("nama : "+user.get("nama"));
        email.setText("email : "+user.get("email"));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sessionManagement.logoutUser();
            }
        });

        return view;
    }
}
