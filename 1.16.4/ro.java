/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ro
/*    */   implements oj<om>
/*    */ {
/*    */   private vk a;
/*    */   private adr b;
/*    */   
/*    */   public ro() {}
/*    */   
/*    */   public ro(@Nullable vk ☃, @Nullable adr adr1) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = adr1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     int i = ☃.readByte();
/* 29 */     if ((i & 0x1) > 0) {
/* 30 */       this.b = ☃.<adr>a(adr.class);
/*    */     }
/* 32 */     if ((i & 0x2) > 0) {
/* 33 */       this.a = ☃.p();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 39 */     if (this.b != null) {
/* 40 */       if (this.a != null) {
/* 41 */         ☃.writeByte(3);
/* 42 */         ☃.a(this.b);
/* 43 */         ☃.a(this.a);
/*    */       } else {
/* 45 */         ☃.writeByte(1);
/* 46 */         ☃.a(this.b);
/*    */       }
/*    */     
/* 49 */     } else if (this.a != null) {
/* 50 */       ☃.writeByte(2);
/* 51 */       ☃.a(this.a);
/*    */     } else {
/* 53 */       ☃.writeByte(0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public vk b() {
/* 60 */     return this.a;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public adr c() {
/* 65 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 70 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */