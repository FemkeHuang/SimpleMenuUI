package com.sample.orderingapp;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sample.orderingapp.databinding.FragmentItemBinding;
import com.sample.orderingapp.placeholder.PlaceholderItem;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyMenuItemRecyclerViewAdapter extends RecyclerView.Adapter<MyMenuItemRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues = new ArrayList<>();
    public MyMenuItemRecyclerViewAdapter(Menu menu) {

        for (int i = 0; i < menu.getCategories().size(); i++) {
            // Category
            MenuCategory Category = menu.getCategories().get(i);
            mValues.add(
                    new PlaceholderItem(
                            Category.getCategoryName(),
                            Category.getNote(),
                            "",
                            "",
                            "",
                            null,
                            "",
                            -1,
                            1.0,
                            ""
                    )
            );
            for (int j = 0; j < Category.getItems().size(); j++) {
                SubCategory subCategory = Category.getItems().get(j);
                mValues.add(
                        new PlaceholderItem(
                                "",
                                subCategory.getNote(),
                                subCategory.getName(),
                                "",
                                "",
                                null,
                                "",
                                -1,
                                1.0,
                                ""
                        )
                );
                for (int k = 0; k < subCategory.getItems().size(); k++) {
                    MenuItem dish = subCategory.getItems().get(k);
                    mValues.add(
                            new PlaceholderItem(
                                    "",
                                    "",
                                    "",
                                    dish.getName(),
                                    dish.getPrice(),
                                    dish.getImage(),
                                    dish.getUnit(),
                                    dish.getNumber(),
                                    dish.getDiscount(),
                                    dish.getDescription()

                            )
                    );
                }
            }
        }
    }

    Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
//        holder.mItem = mValues.get(position);
//        holder.imageView.setImageBitmap();
        PlaceholderItem item = mValues.get(position);
        String category = item.categoryName;
        String sector = item.sectorName;
        String dish = item.dishName;
        holder.dish_layout.setVisibility(View.GONE);
        holder.sector_name.setVisibility(View.GONE);
        holder.sector_name.setText("");
        holder.divider.setVisibility(View.GONE);
        if(category != null &&!category.isEmpty()){
            holder.sector_name.setVisibility(View.VISIBLE);
            holder.sector_name.setTextSize(20);
            holder.sector_name.setTypeface(Typeface.DEFAULT_BOLD);
            holder.sector_name.setText(category);

        }
        else if(sector != null && !sector.isEmpty()){
            holder.sector_name.setVisibility(View.VISIBLE);
            holder.sector_name.setText(sector);
            holder.sector_name.setTextSize(19);
            holder.sector_name.setTypeface(Typeface.SERIF);
        }
        else if (dish!= null && !dish.isEmpty()) {
            holder.sector_name.setVisibility(View.GONE);
            holder.dish_layout.setVisibility(View.VISIBLE);


//            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher_foreground);
//            System.out.println(bitmap);
            holder.imageView.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_launcher_foreground));
//            holder.imageView.setImageBitmap(item.image);
            holder.dishName.setText(item.dishName);
            holder.dishDescription.setText(item.dishDescription);
            holder.number.setText(String.valueOf(item.number));
            holder.priceText.setText(item.price+" "+item.unit);
            holder.divider.setVisibility(View.VISIBLE);
        }

        holder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView sector_name;

        public final LinearLayout dish_layout;
        public final ImageView imageView;
        public final TextView dishName;
        public final TextView dishDescription;
        public final ImageButton addButton;
        public final ImageButton minusButton;
        public final TextView number;
        public final TextView priceText;
        public final View divider;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            dish_layout = binding.dishLayout;
            imageView = binding.dishImage;
            sector_name = binding.sectorName;
            dishName = binding.dishName;
            dishDescription = binding.dishDescription;
            addButton = binding.btnAdd;
            minusButton = binding.btnMinus;
            number = binding.num;
            priceText = binding.dishPrice;
            divider = binding.divider;


        }
    }
}