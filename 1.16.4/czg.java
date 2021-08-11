/*    */ import com.google.common.collect.HashMultimap;
/*    */ import com.google.common.collect.ImmutableMultimap;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
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
/*    */ public class czg
/*    */ {
/*    */   private final Multimap<String, String> a;
/*    */   private final Supplier<String> b;
/*    */   private final dba c;
/*    */   private final Function<vk, dbo> d;
/*    */   private final Set<vk> e;
/*    */   private final Function<vk, cyy> f;
/*    */   private final Set<vk> g;
/*    */   private String h;
/*    */   
/*    */   public czg(dba ☃, Function<vk, dbo> function, Function<vk, cyy> function1) {
/* 31 */     this((Multimap<String, String>)HashMultimap.create(), () -> "", ☃, function, (Set<vk>)ImmutableSet.of(), function1, (Set<vk>)ImmutableSet.of());
/*    */   }
/*    */   
/*    */   public czg(Multimap<String, String> ☃, Supplier<String> supplier, dba dba1, Function<vk, dbo> function, Set<vk> set1, Function<vk, cyy> function1, Set<vk> set2) {
/* 35 */     this.a = ☃;
/* 36 */     this.b = supplier;
/* 37 */     this.c = dba1;
/* 38 */     this.d = function;
/* 39 */     this.e = set1;
/* 40 */     this.f = function1;
/* 41 */     this.g = set2;
/*    */   }
/*    */   
/*    */   private String b() {
/* 45 */     if (this.h == null) {
/* 46 */       this.h = this.b.get();
/*    */     }
/*    */     
/* 49 */     return this.h;
/*    */   }
/*    */   
/*    */   public void a(String ☃) {
/* 53 */     this.a.put(b(), ☃);
/*    */   }
/*    */   
/*    */   public czg b(String ☃) {
/* 57 */     return new czg(this.a, () -> b() + ☃, this.c, this.d, this.e, this.f, this.g);
/*    */   }
/*    */   
/*    */   public czg a(String ☃, vk vk1) {
/* 61 */     ImmutableSet<vk> immutableSet = ImmutableSet.builder().addAll(this.g).add(vk1).build();
/* 62 */     return new czg(this.a, () -> b() + ☃, this.c, this.d, this.e, this.f, (Set<vk>)immutableSet);
/*    */   }
/*    */   
/*    */   public czg b(String ☃, vk vk1) {
/* 66 */     ImmutableSet<vk> immutableSet = ImmutableSet.builder().addAll(this.e).add(vk1).build();
/* 67 */     return new czg(this.a, () -> b() + ☃, this.c, this.d, (Set<vk>)immutableSet, this.f, this.g);
/*    */   }
/*    */   
/*    */   public boolean a(vk ☃) {
/* 71 */     return this.g.contains(☃);
/*    */   }
/*    */   
/*    */   public boolean b(vk ☃) {
/* 75 */     return this.e.contains(☃);
/*    */   }
/*    */   
/*    */   public Multimap<String, String> a() {
/* 79 */     return (Multimap<String, String>)ImmutableMultimap.copyOf(this.a);
/*    */   }
/*    */   
/*    */   public void a(cyw ☃) {
/* 83 */     this.c.a(this, ☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cyy c(vk ☃) {
/* 88 */     return this.f.apply(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public dbo d(vk ☃) {
/* 93 */     return this.d.apply(☃);
/*    */   }
/*    */   
/*    */   public czg a(dba ☃) {
/* 97 */     return new czg(this.a, this.b, ☃, this.d, this.e, this.f, this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */