import { useState } from "react"
import { Link, useNavigate } from "react-router-dom"
import { Button } from "@/components/ui/button"
import {
  Card,
  CardAction,
  CardContent,
  CardDescription,
  CardFooter,
  CardHeader,
  CardTitle,
} from "@/components/ui/card"
import { Input } from "@/components/ui/input"
import { Label } from "@/components/ui/label"
import { RadioGroup, RadioGroupItem } from "@/components/ui/radio-group"

export default function Login() {
  const navigate = useNavigate()
  const [role, setRole] = useState<"user" | "admin">("user")

  const handleLogin = (e: React.FormEvent) => {
    e.preventDefault()
    if (role === "admin") {
      navigate("/admin/products")
    } else {
      navigate("/user/products") // change to your user route if different
    }
  }

  return (
    <div className="w-svw h-svh flex justify-center items-center">
      <Card className="w-full max-w-sm">
        <CardHeader>
          <CardTitle>Login to your account</CardTitle>
          <CardDescription>Enter your email below to login to your account</CardDescription>
          <CardAction>
            <Link to="/register">
              <Button variant="link">Sign Up</Button>
            </Link>
          </CardAction>
        </CardHeader>

        <CardContent>
          <form onSubmit={handleLogin}>
            <div className="flex flex-col gap-6">
              <div className="grid gap-2">
                <Label htmlFor="email">Email</Label>
                <Input id="email" type="email" placeholder="m@example.com" required />
              </div>

              <div className="grid gap-2">
                <Label htmlFor="password">Password</Label>
                <Input id="password" type="password" placeholder="********" required />
              </div>

              {/* ROLE FIELD */}
              <div className="grid gap-2">
                <Label>Role</Label>
                <RadioGroup
                  value={role}
                  onValueChange={(v) => setRole(v as "user" | "admin")}
                  className="flex gap-6"
                >
                  <div className="flex items-center space-x-2">
                    <RadioGroupItem id="role-user" value="user" />
                    <Label htmlFor="role-user" className="cursor-pointer">User</Label>
                  </div>
                  <div className="flex items-center space-x-2">
                    <RadioGroupItem id="role-admin" value="admin" />
                    <Label htmlFor="role-admin" className="cursor-pointer">Admin</Label>
                  </div>
                </RadioGroup>
              </div>

              <CardFooter className="flex-col gap-2 p-0">
                <Button type="submit" className="w-full">Login</Button>
              </CardFooter>
            </div>
          </form>
        </CardContent>
      </Card>
    </div>
  )
}