package mm.marsman.pepcornassignment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView tv_uid,tv_name,tv_payid,tv_status;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_uid = itemView.findViewById(R.id.tv_uid);
        tv_name = itemView.findViewById(R.id.tv_name);
        tv_payid = itemView.findViewById(R.id.tv_payid);
        tv_status = itemView.findViewById(R.id.tv_status);



    }
}
