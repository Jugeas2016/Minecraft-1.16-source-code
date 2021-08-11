/*    */ import com.google.common.base.Joiner;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dba
/*    */ {
/*    */   private final Set<daz<?>> a;
/*    */   private final Set<daz<?>> b;
/*    */   
/*    */   private dba(Set<daz<?>> ☃, Set<daz<?>> set1) {
/* 17 */     this.a = (Set<daz<?>>)ImmutableSet.copyOf(☃);
/* 18 */     this.b = (Set<daz<?>>)ImmutableSet.copyOf((Collection)Sets.union(☃, set1));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 26 */     return this.a;
/*    */   }
/*    */   
/*    */   public Set<daz<?>> b() {
/* 30 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 35 */     return "[" + Joiner.on(", ").join(this.b.stream().map(☃ -> (this.a.contains(☃) ? "!" : "") + ☃.a()).iterator()) + "]";
/*    */   }
/*    */   
/*    */   public void a(czg ☃, cyw cyw1) {
/* 39 */     Set<daz<?>> set = cyw1.a();
/* 40 */     Sets.SetView setView = Sets.difference(set, this.b);
/* 41 */     if (!setView.isEmpty()) {
/* 42 */       ☃.a("Parameters " + setView + " are not provided in this context");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class a
/*    */   {
/* 51 */     private final Set<daz<?>> a = Sets.newIdentityHashSet();
/* 52 */     private final Set<daz<?>> b = Sets.newIdentityHashSet();
/*    */     
/*    */     public a a(daz<?> ☃) {
/* 55 */       if (this.b.contains(☃)) {
/* 56 */         throw new IllegalArgumentException("Parameter " + ☃.a() + " is already optional");
/*    */       }
/* 58 */       this.a.add(☃);
/* 59 */       return this;
/*    */     }
/*    */     
/*    */     public a b(daz<?> ☃) {
/* 63 */       if (this.a.contains(☃)) {
/* 64 */         throw new IllegalArgumentException("Parameter " + ☃.a() + " is already required");
/*    */       }
/* 66 */       this.b.add(☃);
/* 67 */       return this;
/*    */     }
/*    */     
/*    */     public dba a() {
/* 71 */       return new dba(this.a, this.b);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */