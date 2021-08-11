/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pb
/*    */   implements oj<om>
/*    */ {
/*    */   private nr a;
/*    */   private no b;
/*    */   private UUID c;
/*    */   
/*    */   public pb() {}
/*    */   
/*    */   public pb(nr ☃, no no1, UUID uUID) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = no1;
/* 22 */     this.c = uUID;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 27 */     this.a = ☃.h();
/* 28 */     this.b = no.a(☃.readByte());
/* 29 */     this.c = ☃.k();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 34 */     ☃.a(this.a);
/* 35 */     ☃.writeByte(this.b.a());
/* 36 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public nr b() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 49 */     return (this.b == no.b || this.b == no.c);
/*    */   }
/*    */   
/*    */   public no d() {
/* 53 */     return this.b;
/*    */   }
/*    */   
/*    */   public UUID e() {
/* 57 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 62 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */