import java.io.Serializable;

public class Image implements Serializable {
    private int width;
    private int height;
    private byte[] content;

    public Image() {
    }

    public Image(int width, int height, byte[] content) {
        this.width = width;
        this.height = height;
        this.content = content;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public void scale(int factor) {
        width *= factor;
        height *= factor;
    }

    public static class Builder {
        private int width;
        private int height;
        private byte[] content;

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder content(byte[] content) {
            this.content = content;
            return this;
        }

        public Image build() {
            return new Image(width, height, content);
        }
    }
}
