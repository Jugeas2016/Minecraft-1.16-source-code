/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.DataBufferInt;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ public class dit
/*    */ {
/*    */   private int[] a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   @Nullable
/*    */   public BufferedImage a(BufferedImage ☃) {
/* 16 */     if (☃ == null) {
/* 17 */       return null;
/*    */     }
/*    */     
/* 20 */     this.b = 64;
/* 21 */     this.c = 64;
/*    */     
/* 23 */     BufferedImage bufferedImage = new BufferedImage(this.b, this.c, 2);
/* 24 */     Graphics graphics = bufferedImage.getGraphics();
/* 25 */     graphics.drawImage(☃, 0, 0, null);
/*    */     
/* 27 */     boolean bool = (☃.getHeight() == 32);
/* 28 */     if (bool) {
/* 29 */       graphics.setColor(new Color(0, 0, 0, 0));
/* 30 */       graphics.fillRect(0, 32, 64, 32);
/*    */ 
/*    */       
/* 33 */       graphics.drawImage(bufferedImage, 24, 48, 20, 52, 4, 16, 8, 20, null);
/* 34 */       graphics.drawImage(bufferedImage, 28, 48, 24, 52, 8, 16, 12, 20, null);
/* 35 */       graphics.drawImage(bufferedImage, 20, 52, 16, 64, 8, 20, 12, 32, null);
/* 36 */       graphics.drawImage(bufferedImage, 24, 52, 20, 64, 4, 20, 8, 32, null);
/* 37 */       graphics.drawImage(bufferedImage, 28, 52, 24, 64, 0, 20, 4, 32, null);
/* 38 */       graphics.drawImage(bufferedImage, 32, 52, 28, 64, 12, 20, 16, 32, null);
/*    */ 
/*    */       
/* 41 */       graphics.drawImage(bufferedImage, 40, 48, 36, 52, 44, 16, 48, 20, null);
/* 42 */       graphics.drawImage(bufferedImage, 44, 48, 40, 52, 48, 16, 52, 20, null);
/* 43 */       graphics.drawImage(bufferedImage, 36, 52, 32, 64, 48, 20, 52, 32, null);
/* 44 */       graphics.drawImage(bufferedImage, 40, 52, 36, 64, 44, 20, 48, 32, null);
/* 45 */       graphics.drawImage(bufferedImage, 44, 52, 40, 64, 40, 20, 44, 32, null);
/* 46 */       graphics.drawImage(bufferedImage, 48, 52, 44, 64, 52, 20, 56, 32, null);
/*    */     } 
/*    */     
/* 49 */     graphics.dispose();
/*    */     
/* 51 */     this.a = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
/*    */     
/* 53 */     b(0, 0, 32, 16);
/*    */     
/* 55 */     if (bool) {
/* 56 */       a(32, 0, 64, 32);
/*    */     }
/* 58 */     b(0, 16, 64, 32);
/* 59 */     b(16, 48, 48, 64);
/*    */     
/* 61 */     return bufferedImage;
/*    */   }
/*    */   private void a(int ☃, int i, int j, int k) {
/*    */     int m;
/* 65 */     for (m = ☃; m < j; m++) {
/* 66 */       for (int n = i; n < k; n++) {
/* 67 */         int i1 = this.a[m + n * this.b];
/* 68 */         if ((i1 >> 24 & 0xFF) < 128) {
/*    */           return;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 74 */     for (m = ☃; m < j; m++) {
/* 75 */       for (int n = i; n < k; n++) {
/* 76 */         this.a[m + n * this.b] = this.a[m + n * this.b] & 0xFFFFFF;
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private void b(int ☃, int i, int j, int k) {
/* 82 */     for (int m = ☃; m < j; m++) {
/* 83 */       for (int n = i; n < k; n++)
/* 84 */         this.a[m + n * this.b] = this.a[m + n * this.b] | 0xFF000000; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */