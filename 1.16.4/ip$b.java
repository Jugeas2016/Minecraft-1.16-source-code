/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.BiFunction;
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
/*     */ public class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>>
/*     */   extends ip
/*     */ {
/*     */   private final cfj<T1> a;
/*     */   private final cfj<T2> b;
/*     */   
/*     */   private b(cfj<T1> ☃, cfj<T2> cfj1) {
/* 109 */     this.a = ☃;
/* 110 */     this.b = cfj1;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<cfj<?>> b() {
/* 115 */     return (List<cfj<?>>)ImmutableList.of(this.a, this.b);
/*     */   }
/*     */   
/*     */   public b<T1, T2> a(T1 ☃, T2 t2, List<ir> list) {
/* 119 */     iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 120 */           .b(☃), this.b
/* 121 */           .b(t2) });
/*     */     
/* 123 */     a(iq, list);
/* 124 */     return this;
/*     */   }
/*     */   
/*     */   public b<T1, T2> a(T1 ☃, T2 t2, ir ir1) {
/* 128 */     return a(☃, t2, Collections.singletonList(ir1));
/*     */   }
/*     */   
/*     */   public ip a(BiFunction<T1, T2, ir> ☃) {
/* 132 */     this.a.a().forEach(comparable -> this.b.a().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     return this;
/*     */   }
/*     */   
/*     */   public ip b(BiFunction<T1, T2, List<ir>> ☃) {
/* 141 */     this.a.a().forEach(comparable -> this.b.a().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ip$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */