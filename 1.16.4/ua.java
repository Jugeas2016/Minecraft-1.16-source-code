/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ua
/*    */   implements oj<ty>
/*    */ {
/*    */   private GameProfile a;
/*    */   
/*    */   public ua() {}
/*    */   
/*    */   public ua(GameProfile ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 24 */     int[] arrayOfInt = new int[4];
/* 25 */     for (int i = 0; i < arrayOfInt.length; i++) {
/* 26 */       arrayOfInt[i] = ☃.readInt();
/*    */     }
/* 28 */     UUID uUID = gq.a(arrayOfInt);
/* 29 */     String str = ☃.e(16);
/* 30 */     this.a = new GameProfile(uUID, str);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 35 */     for (int i : gq.a(this.a.getId())) {
/* 36 */       ☃.writeInt(i);
/*    */     }
/* 38 */     ☃.a(this.a.getName());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ty ☃) {
/* 43 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public GameProfile b() {
/* 47 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\ua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */