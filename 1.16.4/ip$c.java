/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Collections;
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
/*     */ public class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
/*     */   extends ip
/*     */ {
/*     */   private final cfj<T1> a;
/*     */   private final cfj<T2> b;
/*     */   private final cfj<T3> c;
/*     */   
/*     */   private c(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2) {
/* 156 */     this.a = ☃;
/* 157 */     this.b = cfj1;
/* 158 */     this.c = cfj2;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<cfj<?>> b() {
/* 163 */     return (List<cfj<?>>)ImmutableList.of(this.a, this.b, this.c);
/*     */   }
/*     */   
/*     */   public c<T1, T2, T3> a(T1 ☃, T2 t2, T3 t3, List<ir> list) {
/* 167 */     iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 168 */           .b(☃), this.b
/* 169 */           .b(t2), this.c
/* 170 */           .b(t3) });
/*     */     
/* 172 */     a(iq, list);
/* 173 */     return this;
/*     */   }
/*     */   
/*     */   public c<T1, T2, T3> a(T1 ☃, T2 t2, T3 t3, ir ir1) {
/* 177 */     return a(☃, t2, t3, Collections.singletonList(ir1));
/*     */   }
/*     */   
/*     */   public ip a(ip.h<T1, T2, T3, ir> ☃) {
/* 181 */     this.a.a().forEach(comparable -> this.b.a().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ip$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */