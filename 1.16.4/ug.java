/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ug
/*    */   implements oj<ue>
/*    */ {
/*    */   private GameProfile a;
/*    */   
/*    */   public ug() {}
/*    */   
/*    */   public ug(GameProfile ☃) {
/* 17 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 22 */     this.a = new GameProfile(null, ☃.e(16));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 27 */     ☃.a(this.a.getName());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ue ☃) {
/* 32 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public GameProfile b() {
/* 36 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\ug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */