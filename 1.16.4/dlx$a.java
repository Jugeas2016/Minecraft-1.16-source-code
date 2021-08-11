/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends dlo.a<dlx.a>
/*    */ {
/*    */   private final List<dlh> a;
/*    */   
/*    */   private a(List<dlh> ☃) {
/* 71 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public static a a(dkd ☃, int i, dkc dkc1) {
/* 75 */     return new a((List<dlh>)ImmutableList.of(dkc1.a(☃, i / 2 - 155, 0, 310)));
/*    */   }
/*    */   
/*    */   public static a a(dkd ☃, int i, dkc dkc1, @Nullable dkc dkc2) {
/* 79 */     dlh dlh = dkc1.a(☃, i / 2 - 155, 0, 150);
/* 80 */     if (dkc2 == null) {
/* 81 */       return new a((List<dlh>)ImmutableList.of(dlh));
/*    */     }
/* 83 */     return new a((List<dlh>)ImmutableList.of(dlh, dkc2.a(☃, i / 2 - 155 + 160, 0, 150)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 88 */     this.a.forEach(dlh1 -> {
/*    */           dlh1.m = ☃;
/*    */           dlh1.a(dfm1, i, j, f);
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public List<? extends dmi> au_() {
/* 96 */     return (List)this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */