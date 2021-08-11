/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.text.DecimalFormat;
/*    */ import java.text.DecimalFormatSymbols;
/*    */ import java.util.Locale;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.Timer;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ public class zo extends JComponent {
/*    */   private static final DecimalFormat a;
/*    */   
/*    */   static {
/* 16 */     a = x.<DecimalFormat>a(new DecimalFormat("########0.000"), ☃ -> ☃.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
/*    */   }
/* 18 */   private final int[] b = new int[256];
/*    */   private int c;
/* 20 */   private final String[] d = new String[11];
/*    */   private final MinecraftServer e;
/*    */   private final Timer f;
/*    */   
/*    */   public zo(MinecraftServer ☃) {
/* 25 */     this.e = ☃;
/* 26 */     setPreferredSize(new Dimension(456, 246));
/* 27 */     setMinimumSize(new Dimension(456, 246));
/* 28 */     setMaximumSize(new Dimension(456, 246));
/* 29 */     this.f = new Timer(500, ☃ -> b());
/* 30 */     this.f.start();
/* 31 */     setBackground(Color.BLACK);
/*    */   }
/*    */   
/*    */   private void b() {
/* 35 */     long ☃ = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
/* 36 */     this.d[0] = "Memory use: " + (☃ / 1024L / 1024L) + " mb (" + (Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()) + "% free)";
/* 37 */     this.d[1] = "Avg tick: " + a.format(a(this.e.h) * 1.0E-6D) + " ms";
/* 38 */     this.b[this.c++ & 0xFF] = (int)(☃ * 100L / Runtime.getRuntime().maxMemory());
/* 39 */     repaint();
/*    */   }
/*    */   
/*    */   private double a(long[] ☃) {
/* 43 */     long l = 0L;
/* 44 */     for (long l1 : ☃) {
/* 45 */       l += l1;
/*    */     }
/* 47 */     return l / ☃.length;
/*    */   }
/*    */ 
/*    */   
/*    */   public void paint(Graphics ☃) {
/* 52 */     ☃.setColor(new Color(16777215));
/* 53 */     ☃.fillRect(0, 0, 456, 246);
/*    */     int i;
/* 55 */     for (i = 0; i < 256; i++) {
/* 56 */       int j = this.b[i + this.c & 0xFF];
/* 57 */       ☃.setColor(new Color(j + 28 << 16));
/* 58 */       ☃.fillRect(i, 100 - j, 1, j);
/*    */     } 
/* 60 */     ☃.setColor(Color.BLACK);
/* 61 */     for (i = 0; i < this.d.length; i++) {
/* 62 */       String str = this.d[i];
/* 63 */       if (str != null) {
/* 64 */         ☃.drawString(str, 32, 116 + i * 16);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/* 70 */     this.f.stop();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */