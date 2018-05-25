package es.montanus.bitsandpizzas;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


class CaptionedImagesAdapter extends
        RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>
{
    private final Pizza[] pizzas;
    private Listener listener;

    public CaptionedImagesAdapter(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public interface Listener {
        void onClick(int position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.pizza_image);
        imageView.setImageResource(pizzas[position].getImageResourceId());
        imageView.setContentDescription(pizzas[position].getName());
        TextView textView = cardView.findViewById(R.id.pizza_name);
        textView.setText(pizzas[position].getName());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null)
                    listener.onClick(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return pizzas.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {


        private final CardView cardView;
        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}
