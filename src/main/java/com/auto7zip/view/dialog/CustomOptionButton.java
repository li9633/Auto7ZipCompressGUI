package com.auto7zip.view.dialog;

import com.auto7zip.view.StyledButton;

import java.util.function.Consumer;

public class CustomOptionButton<T> extends StyledButton {
    private T resultValue;
    private Consumer<T> resultConsumer;

    public CustomOptionButton() {
        super();
        initResultHandling();
    }


    public CustomOptionButton(String text) {
        super();
        super.setButtonText(text);
        initResultHandling();
    }

    private void initResultHandling() {
        this.setOnAction(event -> {
            if (resultConsumer != null) {
                resultConsumer.accept(resultValue);
            }
        });
    }

    public void setResultValue(T result) {
        this.resultValue = result;
    }

    public void setResultHandler(Consumer<T> handler) {
        this.resultConsumer = handler;
    }

    public T getResultValue() {
        return resultValue;
    }
}
