/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class bre<T>
/*    */   implements bso<T>
/*    */ {
/*    */   private final List<a<T>> a;
/*    */   private final Function<T, vk> b;
/*    */   
/*    */   static class a<T>
/*    */   {
/*    */     private final T d;
/*    */     public final fx a;
/*    */     public final int b;
/*    */     public final bsq c;
/*    */     
/*    */     private a(T ☃, fx fx1, int i, bsq bsq1) {
/* 21 */       this.d = ☃;
/* 22 */       this.a = fx1;
/* 23 */       this.b = i;
/* 24 */       this.c = bsq1;
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 29 */       return (new StringBuilder()).append(this.d).append(": ").append(this.a).append(", ").append(this.b).append(", ").append(this.c).toString();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public bre(Function<T, vk> ☃, List<bsp<T>> list, long l) {
/* 37 */     this(☃, (List<a<T>>)list.stream().map(bsp1 -> new a(bsp1.b(), bsp1.a, (int)(bsp1.b - ☃), bsp1.c)).collect(Collectors.toList()));
/*    */   }
/*    */   
/*    */   private bre(Function<T, vk> ☃, List<a<T>> list) {
/* 41 */     this.a = list;
/* 42 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(fx ☃, T t) {
/* 47 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(fx ☃, T t, int i, bsq bsq1) {
/* 52 */     this.a.add(new a<>(t, ☃, i, bsq1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(fx ☃, T t) {
/* 57 */     return false;
/*    */   }
/*    */   
/*    */   public mj b() {
/* 61 */     mj ☃ = new mj();
/* 62 */     for (a<T> a : this.a) {
/* 63 */       md md = new md();
/* 64 */       md.a("i", ((vk)this.b.apply((T)a.a(a))).toString());
/* 65 */       md.b("x", a.a.u());
/* 66 */       md.b("y", a.a.v());
/* 67 */       md.b("z", a.a.w());
/* 68 */       md.b("t", a.b);
/* 69 */       md.b("p", a.c.a());
/*    */       
/* 71 */       ☃.add(md);
/*    */     } 
/*    */     
/* 74 */     return ☃;
/*    */   }
/*    */   
/*    */   public static <T> bre<T> a(mj ☃, Function<T, vk> function, Function<vk, T> function1) {
/* 78 */     List<a<T>> list = Lists.newArrayList();
/* 79 */     for (int i = 0; i < ☃.size(); i++) {
/* 80 */       md md = ☃.a(i);
/*    */       
/* 82 */       T t = function1.apply(new vk(md.l("i")));
/* 83 */       if (t != null) {
/* 84 */         fx fx = new fx(md.h("x"), md.h("y"), md.h("z"));
/* 85 */         list.add(new a<>(t, fx, md.h("t"), bsq.a(md.h("p"))));
/*    */       } 
/*    */     } 
/* 88 */     return new bre<>(function, list);
/*    */   }
/*    */   
/*    */   public void a(bso<T> ☃) {
/* 92 */     this.a.forEach(a1 -> ☃.a(a1.a, a.a(a1), a1.b, a1.c));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bre.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */