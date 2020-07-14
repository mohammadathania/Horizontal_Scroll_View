package com.example.horizontal_fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalProductScrollAdapter extends RecyclerView.Adapter<HorizontalProductScrollAdapter.ViewHolder> {

    private List<HorizontalProductScrollModel> horizontalProductScrollModelList;


    @NonNull
    @Override
    public HorizontalProductScrollAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_scroll_item_layout,viewGroup);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalProductScrollAdapter.ViewHolder holder, int position) {
        int resource = horizontalProductScrollModelList.get(position).getProductImage();
        String title = horizontalProductScrollModelList.get(position).getProductTitle();
        String description = horizontalProductScrollModelList.get(position).getProductDescription();
        String price = horizontalProductScrollModelList.get(position).getProductPrice();
        holder.setProductImage(resource);
        holder.setProductDescription(description);
        holder.setProductPrice(price);
        holder.setProductTitle(title);



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;
        private TextView productTitle;
        private TextView productDescription;
        private TextView productPrice;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.h_s_product_image);
            productTitle = itemView.findViewById(R.id.h_s_product_title);
            productPrice = itemView.findViewById(R.id.h_s_product_price);
            productDescription = itemView.findViewById(R.id.h_s_product_description);



        }

        public void setProductImage(int resource) {
            productImage.setImageResource(resource);
        }
        public void setProductDescription(String title) {
            productDescription.setText(title);
        }
        public void setProductTitle(String description) {
            productTitle.setText(description);
        }
        public void setProductPrice(String price) {
            productPrice.setText(price);
        }
    }
}
