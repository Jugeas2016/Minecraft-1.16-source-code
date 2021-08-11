/*    */ import java.util.Vector;
/*    */ import javax.swing.JList;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ public class zn
/*    */   extends JList<String>
/*    */ {
/*    */   private final MinecraftServer a;
/*    */   private int b;
/*    */   
/*    */   public zn(MinecraftServer ☃) {
/* 13 */     this.a = ☃;
/* 14 */     ☃.b(this::a);
/*    */   }
/*    */   
/*    */   public void a() {
/* 18 */     if (this.b++ % 20 == 0) {
/* 19 */       Vector<String> ☃ = new Vector<>();
/* 20 */       for (int i = 0; i < this.a.ae().s().size(); i++) {
/* 21 */         ☃.add(((aah)this.a.ae().s().get(i)).eA().getName());
/*    */       }
/* 23 */       setListData(☃);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */