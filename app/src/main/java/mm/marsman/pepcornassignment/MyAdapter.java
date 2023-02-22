package mm.marsman.pepcornassignment;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mm.marsman.pepcornassignment.fragment.PaymentFragment;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_uid.setText(items.get(position).getUser_id());
        holder.tv_name.setText(items.get(position).getName());
        holder.tv_payid.setText(items.get(position).getPay_id());
        holder.tv_status.setText(String.valueOf(items.get(position).getStatus()));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AppCompatActivity activity = new AppCompatActivity();
//                PaymentFragment paymentFragment = new PaymentFragment();
//                activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec,paymentFragment).addToBackStack(null).commit();

                Toast.makeText(context, String.valueOf(position), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
