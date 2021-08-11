/*    */ import java.util.Arrays;
/*    */ import java.util.stream.Stream;
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
/*    */ 
/*    */ public class doj
/*    */   extends dol
/*    */ {
/*    */   private dlx c;
/* 18 */   private static final dkc[] p = new dkc[] { dkc.s, dkc.O, dkc.o, dkc.K, dkc.V };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public doj(dot ☃, dkd dkd1) {
/* 27 */     super(☃, dkd1, new of("options.mouse_settings.title"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 32 */     this.c = new dlx(this.i, this.k, this.l, 32, this.l - 32, 25);
/*    */     
/* 34 */     if (deo.a()) {
/* 35 */       this.c.a((dkc[])Stream.concat(Arrays.stream((Object[])p), Stream.of(dkc.p)).toArray(☃ -> new dkc[☃]));
/*    */     } else {
/* 37 */       this.c.a(p);
/*    */     } 
/*    */     
/* 40 */     this.e.add(this.c);
/*    */     
/* 42 */     a(new dlj(this.k / 2 - 100, this.l - 27, 200, 20, nq.c, ☃ -> {
/*    */             this.b.b();
/*    */             this.i.a(this.a);
/*    */           }));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 50 */     a(☃);
/* 51 */     this.c.a(☃, i, j, f);
/*    */     
/* 53 */     a(☃, this.o, this.d, this.k / 2, 5, 16777215);
/*    */     
/* 55 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */