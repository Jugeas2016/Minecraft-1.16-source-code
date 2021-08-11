/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   implements dpv.a
/*     */ {
/*     */   private final List<String> a;
/*     */   
/*     */   public c(bmb ☃) {
/*  78 */     this.a = b(☃);
/*     */   }
/*     */   
/*     */   private static List<String> b(bmb ☃) {
/*  82 */     md md = ☃.o();
/*  83 */     if (md != null && bns.a(md)) {
/*  84 */       return dpv.a(md);
/*     */     }
/*     */     
/*  87 */     return (List<String>)ImmutableList.of(nr.a.a((new of("book.invalid.tag")).a(k.e)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  92 */     return this.a.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public nu a(int ☃) {
/*  97 */     String str = this.a.get(☃);
/*     */     try {
/*  99 */       nu nu = nr.a.a(str);
/* 100 */       if (nu != null) {
/* 101 */         return nu;
/*     */       }
/* 103 */     } catch (Exception exception) {}
/*     */     
/* 105 */     return nu.b(str);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpv$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */