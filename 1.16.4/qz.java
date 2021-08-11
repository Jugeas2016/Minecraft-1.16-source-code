/*    */ import java.io.IOException;
/*    */ import java.util.Objects;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qz
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   
/*    */   public qz() {}
/*    */   
/*    */   public qz(int ☃, @Nullable ddk ddk1) {
/* 19 */     this.a = ☃;
/*    */     
/* 21 */     if (ddk1 == null) {
/* 22 */       this.b = "";
/*    */     } else {
/* 24 */       this.b = ddk1.b();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 30 */     this.a = ☃.readByte();
/* 31 */     this.b = ☃.e(16);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 36 */     ☃.writeByte(this.a);
/* 37 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 42 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 46 */     return this.a;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public String c() {
/* 51 */     return Objects.equals(this.b, "") ? null : this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */