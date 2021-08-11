/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvx<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/* 11 */   private final dwn[] b = new dwn[8];
/*    */   private final ImmutableList<dwn> f;
/*    */   
/*    */   public dvx() {
/* 15 */     int ☃ = -16;
/* 16 */     this.a = new dwn(this, 0, 0);
/* 17 */     this.a.a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F);
/* 18 */     this.a.b += 8.0F;
/*    */     
/* 20 */     for (int i = 0; i < this.b.length; i++) {
/* 21 */       this.b[i] = new dwn(this, 48, 0);
/*    */       
/* 23 */       double d = i * Math.PI * 2.0D / this.b.length;
/* 24 */       float f1 = (float)Math.cos(d) * 5.0F;
/* 25 */       float f2 = (float)Math.sin(d) * 5.0F;
/* 26 */       this.b[i].a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);
/*    */       
/* 28 */       (this.b[i]).a = f1;
/* 29 */       (this.b[i]).c = f2;
/* 30 */       (this.b[i]).b = 15.0F;
/*    */       
/* 32 */       d = i * Math.PI * -2.0D / this.b.length + 1.5707963267948966D;
/* 33 */       (this.b[i]).e = (float)d;
/*    */     } 
/*    */     
/* 36 */     ImmutableList.Builder<dwn> builder = ImmutableList.builder();
/* 37 */     builder.add(this.a);
/* 38 */     builder.addAll(Arrays.asList(this.b));
/* 39 */     this.f = builder.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 44 */     for (dwn dwn1 : this.b)
/*    */     {
/* 46 */       dwn1.d = f3;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 52 */     return (Iterable<dwn>)this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */