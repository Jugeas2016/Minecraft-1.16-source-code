/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rl
/*    */   implements oj<om>
/*    */ {
/*    */   private a a;
/*    */   private nr b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public rl() {}
/*    */   
/*    */   public rl(a ☃, nr nr1) {
/* 21 */     this(☃, nr1, -1, -1, -1);
/*    */   }
/*    */   
/*    */   public rl(int ☃, int i, int j) {
/* 25 */     this(a.d, null, ☃, i, j);
/*    */   }
/*    */   
/*    */   public rl(a ☃, @Nullable nr nr1, int i, int j, int k) {
/* 29 */     this.a = ☃;
/* 30 */     this.b = nr1;
/* 31 */     this.c = i;
/* 32 */     this.d = j;
/* 33 */     this.e = k;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 38 */     this.a = ☃.<a>a(a.class);
/* 39 */     if (this.a == a.a || this.a == a.b || this.a == a.c) {
/* 40 */       this.b = ☃.h();
/*    */     }
/* 42 */     if (this.a == a.d) {
/* 43 */       this.c = ☃.readInt();
/* 44 */       this.d = ☃.readInt();
/* 45 */       this.e = ☃.readInt();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 51 */     ☃.a(this.a);
/* 52 */     if (this.a == a.a || this.a == a.b || this.a == a.c) {
/* 53 */       ☃.a(this.b);
/*    */     }
/* 55 */     if (this.a == a.d) {
/* 56 */       ☃.writeInt(this.c);
/* 57 */       ☃.writeInt(this.d);
/* 58 */       ☃.writeInt(this.e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 64 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public a b() {
/* 68 */     return this.a;
/*    */   }
/*    */   
/*    */   public nr c() {
/* 72 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 76 */     return this.c;
/*    */   }
/*    */   
/*    */   public int e() {
/* 80 */     return this.d;
/*    */   }
/*    */   
/*    */   public int f() {
/* 84 */     return this.e;
/*    */   }
/*    */   
/*    */   public enum a {
/* 88 */     a,
/* 89 */     b,
/* 90 */     c,
/* 91 */     d,
/* 92 */     e,
/* 93 */     f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */